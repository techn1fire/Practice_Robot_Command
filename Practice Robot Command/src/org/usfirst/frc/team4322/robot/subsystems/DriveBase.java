package org.usfirst.frc.team4322.robot.subsystems;

import org.usfirst.frc.team4322.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {
	
	// Define Power Distribution Panel
	private PowerDistributionPanel pdp;

	// Define CANJaguars
	private CANJaguar Jaguar_1;
	private CANJaguar Jaguar_2;
	
	// Setup RobotDrive from WPILIB
	private RobotDrive robotDrive;
	
	public DriveBase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		// Create instance for Power Distribution Panel
		// WPILIB automatically looks for the PDP at CAN 0
		pdp = new PowerDistributionPanel();
		
		// Create instances of CANJaguar for each Jaguar
		Jaguar_1 = new CANJaguar(RobotMap.CAN_Jaguar_1);
		Jaguar_2 = new CANJaguar(RobotMap.CAN_Jaguar_2);
		
		// Create instance of robotDrive
		robotDrive = new RobotDrive(Jaguar_1, Jaguar_2);
		
		
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}