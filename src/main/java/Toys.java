import java.util.Random;
import java.util.UUID;

import javax.print.attribute.standard.MediaSize.Other;

public abstract class Toys implements Comparable<Toys> {
    protected String id;
    protected String name;
    protected byte quanity;
    protected int scpecificGravity;
    Random rnd = new Random();

    public Toys() {
        // генерирует ID
        this.id = UUID.randomUUID().toString();
        this.name = "Defaul_name_id_" + this.id;
        // генерируем случайное значение от 1 до 50
        this.quanity = (byte) (rnd.nextInt(50) + 1);
        this.scpecificGravity = (byte) (rnd.nextInt(80) + 20);
    }

    public Toys(int scpecificGravity) {
        // генерирует ID
        this.id = UUID.randomUUID().toString();
        this.name = "Defaul_name_id_" + this.id;
        // генерируем случайное значение от 1 до 50
        this.quanity = (byte) (rnd.nextInt(50) + 1);
        this.scpecificGravity = scpecificGravity;
    }

    @Override
    public String toString() {
        String info = "id: " +
                this.id + " name: " +
                this.name + " quanity:" +
                this.quanity + " scpecificGravity: " +
                this.scpecificGravity;
        return info;
    }

    @Override
    public int compareTo(Toys o) {
        return o.scpecificGravity - this.scpecificGravity;
    }

}