package upb.ticketpurchase.model.domain;


public class Lugagge {
    private String id;
    private double weight;
    private String ticketId;

    
    
    public Lugagge(String id, double weight, String ticketId) {
        this.id = id;
        this.weight = weight;
        this.ticketId = ticketId;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String trainId) {
        this.ticketId = trainId;
    }

    


}
