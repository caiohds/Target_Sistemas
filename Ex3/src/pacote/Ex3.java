package pacote;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite a média mensal: ");
		double media_mensal = leia.nextDouble();
		double maior = 0;
		double menor = 10238093387648.27;
		double valores[] = new double[30];
		try {
		File arquivoXML = new File("C:\\Users\\caioh\\OneDrive\\Área de Trabalho\\Job_rotation\\Ex3\\src\\pacote\\dados.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(arquivoXML);
		NodeList listaDados = doc.getElementsByTagName("row");
		for(int i = 0;i<listaDados.getLength();i++) {
			
			Node noDados = listaDados.item(i);
			
			if(noDados.getNodeType() == Node.ELEMENT_NODE) {
				
				Element elementoDados = (Element) noDados;
				
				
				NodeList listaDeFilhos = elementoDados.getChildNodes();
				
				for(int i2 = 0;i2<listaDeFilhos.getLength();i2++) {
					
					Node noFilho = listaDeFilhos.item(i2);
					
					if(noFilho.getNodeType() == Node.ELEMENT_NODE) {
						
						Element elementoFilho = (Element) noFilho;
						
						switch(elementoFilho.getTagName()) {
			
							case "valor":
								valores[i] =Double.parseDouble(elementoFilho.getTextContent());
								break;
							
						}
					}
				}
			}
		}
		}catch(ParserConfigurationException ex){
			
			Logger.getLogger(Ex3.class.getName()).log(Level.SEVERE,null,ex);
			
		} catch (SAXException ex) {
			
			Logger.getLogger(Ex3.class.getName()).log(Level.SEVERE,null,ex);
		} catch (IOException ex) {
			
			Logger.getLogger(Ex3.class.getName()).log(Level.SEVERE,null,ex);
		}
		int divisor = 0;
		double valor_total = 0;
		for(int i = 0;i<valores.length;i++) {
	
			valor_total += valores[i];
			if(valores[i]>maior) {
				maior = valores[i];
			}else if(valores[i]<menor && valores[i] !=0) {
				menor = valores[i];
			}
			if(valores[i]!= 0) {
				divisor++;
			}
			
		}
		System.out.println("Média mensal: " + media_mensal);
		System.out.println("Valor do mes atual: " + valor_total);
		System.out.printf("Média do diária do mês atual: " + (valor_total/divisor));
		System.out.println();
		System.out.println(valor_total> media_mensal ? "Média atual maior do que média mensal!":"Média atual menor do que média mensal");
		System.out.printf("Maior valor: " + maior);
		System.out.println();
		System.out.printf("Menor valor: " + menor);
		
	}
	
}
