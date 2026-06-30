public class Task{
    private int id;
    private int duration;
    private int impact;
    public Task(int id, int duration,int impactscore){
        this.id=id;
        this.duration=duration;
        this.impactscore=impactscore;
    }
    public int getId(){
        return id;
    }
    public int getDuration(){
        return duration;
    }
    public int getImpactscore(){
        return impactscore;
    }
}