package br.com.scve.bean;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

import org.omnifaces.util.Faces;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio <T>{
	
	private HttpServletResponse response;
	private FacesContext context;
	private Connection con;
	
	public Relatorio() {
		this.context = FacesContext.getCurrentInstance();
		this.response = (HttpServletResponse) this.context.getExternalContext().getResponse();
	}
	
	
	public void getRelatorio(List<T> lista){
		try{
			String caminho = Faces.getRealPath("/pages/reports/clientes/Clientes");
			String caminhoimagem = Faces.getRealPath("/pages/reports/scve.png");
			//JasperReport report = JasperCompileManager.compileReport(caminho+".jrxml");
			JasperCompileManager.compileReportToFile(caminho+".jrxml");
			JasperReport rp = (JasperReport) JRLoader.loadObjectFromFile(caminho+".jasper");
			//InputStream stream = getClass().getResourceAsStream("Clientes.jasper"); //this.getClass().getResourceAsStream(caminho+".jasper");
			Map<String, Object> params = new HashMap<String, Object>();
			//Map params = new HashMap();
			
			//ImageIcon gto = new ImageIcon(getClass().getResource(caminhoimagem));
			params.put("LOGOS", caminhoimagem);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
			//JRBeanCollectionDataSource datasrc = new JRBeanCollectionDataSource(lista);
			
			//JasperReport jasper = (JasperReport) JRLoader.loadObject(stream);
			
			//para usar JavaBeanDataSource define 'datasrc' como datasource
			//JasperPrint print = JasperFillManager.fillReport(report, params, getConexao());
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
