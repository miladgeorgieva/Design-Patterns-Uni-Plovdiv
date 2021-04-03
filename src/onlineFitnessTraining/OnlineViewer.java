package onlineFitnessTraining;

public class OnlineViewer implements Observer {
	
	private String name;
	private Observable trainee;
	
	public OnlineViewer(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.trainee == null) {
			System.out.println(this.name + " is not watching any trainees right now.");
			return;
		}
		String exerciseName = this.trainee.getUpdate();
		System.out.println(this.name + " is doing " + exerciseName);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}
}
