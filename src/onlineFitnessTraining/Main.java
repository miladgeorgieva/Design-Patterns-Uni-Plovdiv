package onlineFitnessTraining;

public class Main {

	public static void main(String[] args) {

		Trainee trainee = new Trainee();
		FitnessInstructor fitnessInstructor = new FitnessInstructor("Pavel");
		Observer onlineViewer1 = new OnlineViewer("Iva");
		Observer onlineViewer2 = new OnlineViewer("Maria");
		Observer onlineViewer3 = new OnlineViewer("Stefan");
		
		trainee.subscribe(fitnessInstructor);
		trainee.subscribe(onlineViewer1);
		trainee.subscribe(onlineViewer2);
		trainee.subscribe(onlineViewer3);
		
		CommandFactory commandFactory = new CommandFactory();
		Command getUpCommand = commandFactory.createCommand("Up", trainee);
		Command layDownCommand = commandFactory.createCommand("Down", trainee);
//		Command getUpCommand = new GetUpCommand(trainee);
//		Command layDownCommand = new LayDownCommand(trainee);
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.giveCommand();
		
		fitnessInstructor.setCommand(layDownCommand);
		fitnessInstructor.giveCommand();
	}

}
