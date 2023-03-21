class ZeleDort implements DortInter{

    private DortInter dort;

    public ZeleDort(DortInter dort) {

        this.dort = dort;

    }

    public String upecDort() {

        return dort.upecDort() + "se želem, ";

    }

}