class PiskotDort implements DortInter{

    private DortInter dort;

    public PiskotDort(DortInter dort) {

        this.dort = dort;

    }

    public String upecDort() {

        return dort.upecDort() + "s piškotem, ";

    }

}