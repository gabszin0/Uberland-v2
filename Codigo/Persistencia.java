import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {
	
	public static void escreverArquivoBin(String nomedoarquivo, Object objeto) throws IOException {
		FileOutputStream f = new FileOutputStream (nomedoarquivo);
		ObjectOutputStream escritor = new ObjectOutputStream (f);
		
		escritor.writeObject(objeto);
		escritor.close();	
	}
	
	public static Object lerArquivoBin(String nomedoarquivo) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream (nomedoarquivo);
		ObjectInputStream leitor = new ObjectInputStream(f);
		
		Object objeto = (Object)leitor.readObject();
		leitor.close();
		return objeto;
	}

}