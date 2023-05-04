public class LocaLisa {
    public static void main(String[] args) {
        Repositorio estoque = new Repositorio();

        Moto m1 = new Moto();
        Carro c1 = new Carro();

        m1.setMarca("Honda");
        m1.setPlaca("HIASUF141369");
        m1.setQuilometragem(10000);
        m1.setValor(25000);
        m1.setTipo("manual");
        m1.setCilindradas(100);
        
        estoque.addProduto(m1);

        m1.setMarca("susuki");
        m1.setPlaca("AJBF123478");
        m1.setQuilometragem(15000);
        m1.setValor(35000);
        m1.setTipo("manual");
        m1.setCilindradas(150);

        estoque.addProduto(m1);

        m1.setMarca("Honda");
        m1.setPlaca("AGU241ASDBH");
        m1.setQuilometragem(13000);
        m1.setValor(35000);
        m1.setTipo("eletrica");
        m1.setCilindradas(100);

        estoque.addProduto(m1);

        c1.setMarca("VW");
        c1.setPlaca("HFUA12379");
        c1.setQuilometragem(40000);
        c1.setValor(25000);
        c1.setPotencia(120);
        c1.setPortas(2);

        estoque.addProduto(c1);

        c1.setMarca("HYUNDAI");
        c1.setPlaca("ASFUO1234");
        c1.setQuilometragem(10000);
        c1.setValor(25000);
        c1.setPotencia(100);
        c1.setPortas(4);

        estoque.addProduto(c1);

        c1.setMarca("BMW");
        c1.setPlaca("ASGU12947");
        c1.setQuilometragem(20000);
        c1.setValor(85000);
        c1.setPotencia(200);
        c1.setPortas(4);

        estoque.addProduto(c1);

        estoque.litaVeic();
    }
}