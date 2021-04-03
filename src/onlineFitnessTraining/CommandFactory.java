package onlineFitnessTraining;

public class CommandFactory {

	public Command createCommand(String commandName, Trainee trainee) {
		if (commandName == "Up") {
			return new GetUpCommand(trainee);
		}
		
		if (commandName == "Down") {
			return new LayDownCommand(trainee);
		}
		
		System.out.println("Unknown cheese product: " + commandName);
		
		return null;
	}
	
}
