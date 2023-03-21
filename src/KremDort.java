class KremDort implements DortInter{

    private DortInter dort;

    public KremDort(DortInter dort) {

        this.dort = dort;

    }

    public String upecDort() {

        return dort.upecDort() + "s krémem, ";

    }

}