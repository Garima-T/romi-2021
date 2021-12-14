package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain2;
public class AutonomousDistance2 extends SequentialCommandGroup{
    /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance2(Drivetrain2 m_drivetrain) {
    addCommands(
        new DriveDistance(-0.5, 10, m_drivetrain),
        new TurnDegrees(-0.5, 180, m_drivetrain),
        new DriveDistance(-0.5, 10, m_drivetrain),
        new TurnDegrees(0.5, 180, m_drivetrain));
  }
}

