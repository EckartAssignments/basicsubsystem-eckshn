package com.team4099.falconcamps;

import com.team4099.falconcamps.commands.intake.IntakeCommand;
import com.team4099.falconcamps.commands.intake.IntakeDefaultCommand;
import com.team4099.falconcamps.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

    private final IntakeSubsystem intake = new IntakeSubsystem();
    //ignore xbox thing
    XboxController controller = new XboxController(0);

    public RobotContainer() {
        intake.setDefaultCommand(new IntakeDefaultCommand(intake));
        //ignore line below
        new Trigger(controller::getAButton).whenActive(new IntakeCommand(intake));
    }
}
