package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class ShooterSub extends Subsystem {
    private static Compressor mainCompressor = new Compressor(5);
    private static Solenoid fireSolenoid = new Solenoid(4);

    public ShooterSub() {
        mainCompressor.start();
    }

    @Override
    protected void initDefaultCommand() {}

    public void Fire() {
        fireSolenoid.set(true);

        new WaitCommand(1.0).close();

        fireSolenoid.set(false);
    }
}
