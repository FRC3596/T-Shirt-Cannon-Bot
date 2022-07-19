package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;

public class DriveTrainSub extends Subsystem {
    private static TalonSRX LeftBottom = new TalonSRX(0);
    private static TalonSRX LeftTop = new TalonSRX(1);
    private static VictorSPX RightBottom = new VictorSPX(2);
    private static VictorSPX RightTop = new VictorSPX(3);

    public DriveTrainSub() {}

    @Override
    protected void initDefaultCommand() {}
    
    public void Drive() {
        /*
        RightBottom.set(ControlMode.PercentOutput, OI.RIGHT_Y_AXIS());
        RightTop.set(ControlMode.PercentOutput, OI.RIGHT_Y_AXIS());

        LeftBottom.set(ControlMode.PercentOutput, OI.LEFT_Y_AXIS()*-1);
        LeftTop.set(ControlMode.PercentOutput, OI.LEFT_Y_AXIS()*-1);
        */

        RightBottom.set(ControlMode.PercentOutput, (OI.LEFT_Y_AXIS()-(OI.LEFT_X_AXIS()*-1)));
        RightTop.set(ControlMode.PercentOutput, (OI.LEFT_Y_AXIS()-(OI.LEFT_X_AXIS()*-1)));

        LeftBottom.set(ControlMode.PercentOutput, ((OI.LEFT_Y_AXIS()*-1)-(OI.LEFT_X_AXIS()*-1)));
        LeftTop.set(ControlMode.PercentOutput, ((OI.LEFT_Y_AXIS()*-1)-(OI.LEFT_X_AXIS()*-1)));
    }
}
