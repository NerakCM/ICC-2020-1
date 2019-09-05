public class Temperatura{
	public static int CELCIUS=0;
	public static int FAHRENHEIT=0;
	double valor;
	int escala;
	public Temperatura (double valor, int escala){
		this.valor=valor;
		this.escala=escala;
}

	public double convertirACelcius(double valorF){
		return ((valorF - 32)/ 1.8);
	}
	public double convertirAFahrenheit (double valorC){
		return (valorC*1.8 + 32);
	}
	public double obtenerTemperaturaEnCelcius(){
		if (escala== CELCIUS){
			return  valor;
		} else {
			return convertirACelcius (valor);
		}
	 }
	public double obtenerTemperaturaEnFahrenheit(){
		if (escala== FAHRENHEIT){
			return  valor;
		} else {
			return convertirAFahrenheit (valor);
		}

	}
	public boolean esIgual(Temperatura temp){
		if (escala==temp.escala && valor ==temp.valor){
			return true;
		} else {
			return false;
		}
//return (escala==temp.escala && valor == temp.valor)
	}

	public boolean esMayor(Temperatura temp){

			return obtenerTemperaturaEnCelcius() > temp.obtenerTemperaturaEnCelcius();
	}
	public boolean esMenor(Temperatura temp){

			return obtenerTemperaturaEnCelcius() < temp.obtenerTemperaturaEnCelcius();
	}
}