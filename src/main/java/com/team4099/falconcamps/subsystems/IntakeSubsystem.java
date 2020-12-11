package com.team4099.falconcamps.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private TalonSRX intake = new TalonSRX(5);

    public void setPower(double power) {
        intake.set(ControlMode.PercentOutput, power);
    }

    @Override
    public void periodic() {

    }
}