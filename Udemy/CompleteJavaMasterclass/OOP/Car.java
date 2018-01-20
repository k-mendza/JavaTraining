package Udemy.CompleteJavaMasterclass.OOP;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // public setter of model String field checking validity of entered String value
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("holden"))
            {
                this.model = model;
            }else{
            this.model = "Unknown model";
        }
        this.model = model;
    }
    // public getter of model String field
    public String getModel() {
        return this.model;
    }
}
