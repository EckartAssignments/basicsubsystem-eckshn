package com.team4099.falconcamps.commands.intake;

import com.team4099.falconcamps.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeDefaultCommand extends CommandBase {
    //ignore this file please
    private IntakeSubsystem intake;

    public IntakeDefaultCommand(IntakeSubsystem intake) {
        this.intake = intake;
        this.addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.setPower(0.0);
    }
}
