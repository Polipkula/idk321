class FondanDort implements DortInter{

    private DortInter dort;

    public FondanDort(DortInter dort) {

        this.dort = dort;

    }

    public String upecDort() {

        return dort.upecDort() + "s fondánem, ";

    }

}