/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Frontwaver extends Subsystem {

    public DoubleSolenoid paul = new DoubleSolenoid(1, 0);

    public void wavePaul() {
        paul.set(Value.kForward);
    }

    public void unwavePaul() {
        paul.set(Value.kReverse);
    }

    public Value getPosition() {
        return paul.get();
    }

    @Override
    public void initDefaultCommand() {
        // setthe default command for a subsystem
    }
}