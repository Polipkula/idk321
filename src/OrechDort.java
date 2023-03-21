class OrechDort implements DortInter{

    private DortInter dort;

    public OrechDort(DortInter dort) {

        this.dort = dort;

    }

    public String upecDort() {

        return dort.upecDort() + "s ořechem, ";

    }

}