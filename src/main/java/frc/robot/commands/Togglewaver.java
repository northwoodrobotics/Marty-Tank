/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Frontwaver;

public class Togglewaver extends Command {
  private Frontwaver frontwaver;
  public Togglewaver(Frontwaver kate) {
    frontwaver = kate;
    requires(frontwaver);

    

    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }
  public Togglewaver() {
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    if (frontwaver.getPosition() == Value.kForward) {
    frontwaver.unwavePaul();
    System.out.print("waving Paul");
  } else {
    frontwaver.wavePaul();
    System.out.println("unwaveing Paul");
  }
}

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
