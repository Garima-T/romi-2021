package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import edu.wpi.first.wpilibj.interfaces.Accelerometer;
// import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Drivetrain2 extends SubsystemBase{
    private Spark motor_left;
    private Spark motor_right;
    private Encoder encoder_left;
    private Encoder encoder_right;
    private DifferentialDrive differentialDrive;
    public Drivetrain2()
    {
        configMotor();
        configEncoders();
        differentialDrive = new DifferentialDrive(motor_left, motor_right);
        resetEncoders();
    }
    public void arcadeDrive(double xaxisSpeed, double zRotation)
    {
        differentialDrive.arcadeDrive(xaxisSpeed, zRotation);
    }
    public void configMotor()
    {
        motor_left = new Spark(0);
        motor_right = new Spark(1);
    }
    public void configEncoders()
    {
        encoder_left = new Encoder(4, 5);
        encoder_right = new Encoder(6, 7);
    }
    public void resetEncoders()
    {
        encoder_left.reset();
        encoder_right.reset();
    }
    public double getLeftEncoderCount()
    {
        return encoder_left.get();
    }
    public double getRightEncoderCounter()
    {
        return encoder_right.get();
    }
    public double getLeftDistanceInch()
    {
        return encoder_left.getDistance();
    }
    public double getRightDistanceInch()
    {
        return encoder_right.getDistance();
    }
    public void periodic()
    {
        //nothing
    }
    public double getAverageDistanceInch() {
        return (getRightDistanceInch() + getLeftDistanceInch())/2;
    }
}