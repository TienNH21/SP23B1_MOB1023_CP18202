package Lesson2_Lab1;

import java.util.ArrayList;

public class ProductService implements IProductService {
    private ArrayList<Product> dssp = new ArrayList<>();

    @Override
    public void insert(Product p) {
        this.dssp.add(p);
    }

    @Override
    public void update(int viTri, Product p) {
        this.dssp.set(viTri, p);
    }

    @Override
    public void delete(int viTri) {
        this.dssp.remove(viTri);
    }

    @Override
    public ArrayList<Product> select() {
        return this.dssp;
    }
}
