package onlineFitnessTraining;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
	private List<Observer> observers = new ArrayList<>();
	private String exerciseName;
	private Boolean isUp;
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
		this.notifyObservers();
	}
	
	public void getUp() {
		System.out.println("Trainee is up.");
		this.isUp = true;
		this.exerciseName = "Up";
		this.notifyObservers();
	}
	
	public void layDown() {
		System.out.println("Trainee is down.");
		this.isUp = false;
		this.exerciseName = "Down";
		this.notifyObservers();
	}
}
