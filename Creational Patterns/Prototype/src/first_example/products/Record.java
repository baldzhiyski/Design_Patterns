package first_example.products;

public class Record implements Copyable{
    private int id;
    private String data;

    public Record(int id, String data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public Copyable clone() {
        return new Record(this.id, this.data);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
