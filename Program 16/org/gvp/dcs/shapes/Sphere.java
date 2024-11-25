package org.gvp.dcs.shapes;

public class Sphere {
    private int radius;
    
    public Sphere(int r)
    {
        radius=r;
    }

    public double volume()
    {
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }
    
    public int diameter()
    {
        return 2*radius;
    }

    public double surfacearea()
    {
        return 4*Math.PI*radius*radius;
    }
}