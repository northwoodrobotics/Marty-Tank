/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

/**
 * An example command. You can replace me with your own command.
 */
public class TeleDrive extends Command {
  private Drivetrain teleDriveDrivetrain;

  public TeleDrive(Drivetrain rintaro) {
    // Use requires() here to declare subsystem dependencies
    teleDriveDrivetrain = rintaro;
    requires(teleDriveDrivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // this is tank
    teleDriveDrivetrain.tankDrive(-OI.xbox.getY(Hand.kLeft), OI.xbox.getY(Hand.kRight));

    // this is arcade
    teleDriveDrivetrain.arcadeDrive(OI.deadband(-OI.xbox.getY(Hand.kLeft)),
        OI.deadband(OI.xbox.getX(Hand.kRight)) * (1 - (Math.abs(OI.deadband(OI.xbox.getY(Hand.kLeft)) * 0.5))));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
