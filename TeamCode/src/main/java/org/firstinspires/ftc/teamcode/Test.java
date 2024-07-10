package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Test")
public class Test extends OpMode {

        private DcMotor LM;
        private DcMotor RM;

        private pluh pluh;

    @Override
    public void init() {
        LM = hardwareMap.get(DcMotor.class, "LM");
        LM = hardwareMap.get(DcMotor.class, "RM");
        pluh = new pluh(6);
    }

    @Override
    public void loop() {

    }
    public void drive(double leftJoystick, double rightJoyStick){
        LM.setPower(leftJoystick);
        RM.setPower(rightJoyStick);
    }
    }
