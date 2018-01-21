package Udemy.CompleteJavaMasterclass.EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public void tonerRefill(){
        this.tonerLevel = 100;
    }
    public void printPage(int pages){
        System.out.println("Printer has printed " + pages + " pages");
        this.pagesPrinted += pages;
    }
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <=100 && tonerLevel >0){
            this.tonerLevel = tonerLevel;
        }else{
            System.out.println("Toner level value must be between 0-100%");
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
