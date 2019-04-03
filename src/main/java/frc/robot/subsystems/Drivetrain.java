/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  public VictorSP leftFront = new VictorSP(RobotMap.drivetrainLF);
  public VictorSP rightFront = new VictorSP(RobotMap.drivetrainRF);
  public VictorSP leftBack = new VictorSP(RobotMap.drivetrainLB);
  public VictorSP rightBack = new VictorSP(RobotMap.drivetrainRB);

  public void tankDrive(double leftSpeed, double rightSpeed) {
    leftFront.set(leftSpeed);
    rightFront.set(rightSpeed);
    leftBack.set(leftSpeed);
    rightBack.set(rightSpeed);
  }

  public void arcadeDrive(double forward, double rotate) {
    leftFront.set(forward + rotate);
    rightFront.set(forward - rotate);
    leftBack.set(forward + rotate);
    rightBack.set(forward - rotate);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
