package vttp.sdf6b.workshop;

import java.beans.beancontext.BeanContextServiceAvailableEvent;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BoxString b = new BoxString(null);
        System.out.println( "This is a string." );

        System.out.println(b.getContent());

        BoxString b2 = new BoxString("This is not a string!");
        System.out.println(b2.getContent());

        Box b3 = new Box();
        b3.setContent(2333);
        System.out.println();
        
        b3.setContent(false);
        System.out.println(b3.getContent());

        b3.setContent(new BoxString(null));
        System.out.println(b3.getContent());

        BoxG<Integer> ggInt = new BoxG<>();

        ggInt.setContent(111);

        BoxG<Boolean> ggBol = new BoxG<>();
        ggBol.setContent(true);

        BoxG<Double> ggDbl = new BoxG<>();
        ggDbl.setContent(12.2);

        String[] lines = new String[10];
        lines[0] = "hello";
        System.out.println(lines);

        Float[][] mat = new Float[3][3];
        System.out.println(mat);

        float[][] mat2 = new float[3][];
        for (int i = 0 < mat2.length; i++) {
            mat2[i] = new float[3];
        }
    }
}
