public class Book {
    private int id;
    private String name;
    private Author author;
    private double price;
    private int stock;

    public Book(int id, String name, Author author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book(int id, String name, Author author, double price){
        this(id, name, author); //retoma o construtor acima
        this.setPrice(price);
    }

    public Book(int id, String name, Author author, int stock){
        this(id, name, author);
        this.setStock(stock);
    }

    public Book(int id, String name, Author author, double price, int stock){
        this(id, name, author, price, stock);

    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){
        if (stock < 0.0){
            throw new IllegalArgumentException("ERRO: o estoque não pode ser menor que zero");
        }
        this.stock = stock;
    }

    public void setPrice(double price){
        if (price <= 0.0){
            throw new IllegalArgumentException("ERRO: o preço não pode ser menor ou igual a zero");
        }
        this.price = price;
        
    }

    @Override
    public String toString(){
        return "Book Id ="+ id +
        "/n Name =" + name +
        "/n Author =" + author +
        "/n Price =" + price +
        "/n Stock =" + stock;
    }
}



