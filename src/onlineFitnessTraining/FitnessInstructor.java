package onlineFitnessTraining;

public class FitnessInstructor implements Observer {

	private String name;
	private Observable trainee;
	private Command command;
	
	public FitnessInstructor(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.trainee == null) {
			System.out.println(this.name + " is not giving commands to any trainee right now.");
			return;
		}
		String exerciseName = this.trainee.getUpdate();
//		System.out.println(this.name + " gave commad " + exerciseName);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void giveCommand() {
		System.out.println("Fitness instructor is giving command...");
		this.command.execute();
	}
}
