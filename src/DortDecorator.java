public class DortDecorator {

    public static void main(String[] args){

        String dort = new ZeleDort(new FondanDort(new KremDort(new OrechDort(new PiskotDort(new Dort()))))).upecDort();

        System.out.println(dort);

    }

}