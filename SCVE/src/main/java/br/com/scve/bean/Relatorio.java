package br.com.scve.bean;


import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;


import org.omnifaces.util.Faces;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;


public class Relatorio <T>{
	
	private HttpServletResponse response;
	private FacesContext context;
	private Connection con;
	
	public Relatorio() {
		this.context = FacesContext.getCurrentInstance();
		this.response = (HttpServletResponse) this.context.getExternalContext().getResponse();
	}
	
	
	public void rel_clientes(List<T> lista){
		try{
			String caminho = Faces.getRealPath("/pages/reports/clientes/Clientes");
			String caminhoimagem = Faces.getRealPath("/pages/reports/scve.png");
			JasperCompileManager.compileReportToFile(caminho+".jrxml");
			JasperReport rp = (JasperReport) JRLoader.loadObjectFromFile(caminho+".jasper");
			Map<String, Object> params = new HashMap<String, Object>();

			params.put("LOGOS", caminhoimagem);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
			JasperPrint print = JasperFillManager.fillReport(rp, params, getConexao());
			JasperExportManager.exportReportToPdfStream(print, baos);
			
			response.reset();
			response.setContentType("application/pdf");
			response.setContentLength(baos.size());
			response.setHeader("Content-disposition","inline; filename=relatorio.pdf");
			response.getOutputStream().write(baos.toByteArray());
			response.getOutputStream().flush();
			response.getOutputStream().close();
			context.responseComplete();
			closeConnection();
			
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro ao gerar o relatorio!"));
		}
		
	}
	
	public void rel_clientes_lista(String situacao,String vendedor,String vendedor1, Date data, Date data1){
		try{
			String caminho = "";
			caminho = Faces.getRealPath("/pages/reports/clientes/Clientes_Lista");
			String caminhoimagem = Faces.getRealPath("/pages/reports/scve.png");
			JasperCompileManager.compileReportToFile(caminho+".jrxml");
			JasperReport rp = (JasperReport) JRLoader.loadObjectFromFile(caminho+".jasper");
			
			Map<String, Object> params = new HashMap<String, Object>();
			boolean b = false;
			if (situacao.equals("A")){
				b = true;
				params.put("SITUACAO", b);
				params.put("SITUACAO1", b);
			}else if (situacao.equals("I")){
				b = false;
				params.put("SITUACAO", b);
				params.put("SITUACAO1", b);
			}else{
				boolean b1 = true;
				params.put("SITUACAO", b);
				params.put("SITUACAO1", b1);
			}
			
			if(vendedor.equals("")){
				params.put("VENDEDOR", 0);
				params.put("VENDEDOR1", 999999999);
			}else{
				params.put("VENDEDOR", Integer.parseInt(vendedor));
				params.put("VENDEDOR1", Integer.parseInt(vendedor1));
			}
			
			
			params.put("DATA", data);
			params.put("DATA1", data1);			
			
			params.put("LOGOS", caminhoimagem);
			
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			JasperPrint print = JasperFillManager.fillReport(rp, params,  getConexao());
			JasperExportManager.exportReportToPdfStream(print, baos);
			
			response.reset();
			response.setContentType("application/pdf");
			response.setContentLength(baos.size());
			response.setHeader("Content-disposition","inline; filename=relatorio.pdf");
			response.getOutputStream().write(baos.toByteArray());
			response.getOutputStream().flush();
			response.getOutputStream().close();
			context.responseComplete();
			closeConnection();
			
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro ao gerar o relatorio!"));
		}
		
	}

	
	private Connection getConexao(){
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/scve", "postgres", "postgres");
			return con;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	private void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
