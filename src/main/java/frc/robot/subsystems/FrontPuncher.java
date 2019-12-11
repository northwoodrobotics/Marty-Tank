/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class FrontPuncher extends Subsystem {
  public DoubleSolenoid paul = new DoubleSolenoid(1, 0);
  public DoubleSolenoid paul2 = new DoubleSolenoid(2, 3);

  public void punchPaul() {
    paul.set(Value.kForward);
    paul2.set(Value.kForward);
  }

  public void unpunchPaul() {
    paul.set(Value.kReverse);
    paul2.set(Value.kReverse);
  }

  public Value getPosition() {
    return paul.get();
  }

  public Value getPosition2() {
    return paul2.get();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.

  }

}
