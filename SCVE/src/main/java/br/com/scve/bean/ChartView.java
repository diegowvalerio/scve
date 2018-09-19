package br.com.scve.bean;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;

import br.com.scve.entidades.Movimento;
import br.com.scve.modelo.servico.ServicoMovimento;
 
@Named
@ViewScoped
public class ChartView implements Serializable {
	private static final long serialVersionUID = 1L;
 
    private LineChartModel animatedModel1;
    private BarChartModel animatedModel2;
    
    /*data para o grafico 1*/
    private Movimento movimento = new Movimento();
    @Inject
	private ServicoMovimento servico;
	private Date data_grafico = new Date();
	private List<Movimento> listamovimentos = new ArrayList<>();
 
    @PostConstruct
    public void init() {
        createAnimatedModels();
        
    }
 
    public LineChartModel getAnimatedModel1() {
        return animatedModel1;
    }
 
    public BarChartModel getAnimatedModel2() {
        return animatedModel2;
    }
 
    private void createAnimatedModels() {
        animatedModel1 = initLinearModel();
        animatedModel1.setTitle("Line Chart");
        animatedModel1.setAnimate(true);
        animatedModel1.setLegendPosition("se");
        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
         
        animatedModel2 = initBarModel();
        animatedModel2.setTitle("Pedidos do Dia");
        animatedModel2.setAnimate(true);
        animatedModel2.setLegendPosition("ne");
        yAxis = animatedModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        //yAxis.setMax(20000);
        yAxis.setTickFormat("R$ %'.2f");
        yAxis.setLabel("Valor");
        
        Axis XAxis = animatedModel2.getAxis(AxisType.X);
        XAxis.setLabel("Tipo de Pedido");
    }
     
    @SuppressWarnings("null")
	private BarChartModel initBarModel() {
    	
    	listamovimentos = servico.movimentodia(data_grafico);
    	
    	 BarChartModel model = new BarChartModel();
         
    	if(!listamovimentos.isEmpty()){
    		List<String> tipo = new ArrayList<>();
    		for (Movimento movimento1: listamovimentos){
    			tipo.add(movimento1.getTipomv().getNome());
    		}
    		List<String> tipoc = new ArrayList<>();
    		for(String c : tipo){
    			if(!tipoc.contains(c)){
    				tipoc.add(c);
    			}
    		}
    		
    		ChartSeries tipopedido = new ChartSeries();
    		Date d = new Date();
    		String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
    		tipopedido.setLabel(dStr);
    		for(String c:tipoc){
    			double total = 0;
    			for (Movimento movimento1: listamovimentos){
        			if(movimento1.getTipomv().getNome().equals(c)){
        			total += movimento1.getTotalvenda();	
        			}
        		}
    		 tipopedido.set(c, total);	
    		 
    		}
    		model.addSeries(tipopedido);
    	}
                
        return model;
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");
 
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
         
        return model;
    }
    
    /*grafico*/
	public Date getData_grafico() {
		return data_grafico;
	}
	public void setData_grafico(Date data_grafico) {
		this.data_grafico = data_grafico;
	}
    
}