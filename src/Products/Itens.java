package Products;

public class Itens {
private int codigo;
private String name;
private int estoque;
private double preço;

public Itens(){}

public Itens(Integer i, String s, Integer in, Double d) {
	i = codigo;
	s = name;
	in = estoque;
	d = preço;
} 

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}


//guardando(get) e inserindo(set) valor em nameP

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

//guardando(get) e inserindo(set) valor em estoque

public int getEstoque() {
	return estoque;
}
public void setEstoque(int estoque) {
	this.estoque = estoque;
}

//guardando(get) e inserindo(set) valor em preço

public double getPreço() {
	return preço;
}

public void setPreço(double preço) {
	this.preço = preço;
}

//não utilizada no momento, mas mostra o valor de um item cadastrado

public String toString() {
	String p1= "";
	p1 =    "\n Nome do produto é: " + getName()
	 	+ "\n Estoque atual é de: " + getEstoque()
	 	+ "\n Preço do produto é: " + getPreço();
	return p1;
}
}