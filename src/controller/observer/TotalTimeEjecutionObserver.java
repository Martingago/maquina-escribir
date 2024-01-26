package controller.observer;

public interface TotalTimeEjecutionObserver {
    
    //incrementa el tiempo de ejecucion (segundos)
    public void updateTimeEjecution();
    
    //formatea el tiempo total de ejecucion en hh:mm:ss
    public String formatTimeEjecution(long timeEjecution);
    
    
    public void printTimeEjecution(String formattedtimeEjecution);
    
}
