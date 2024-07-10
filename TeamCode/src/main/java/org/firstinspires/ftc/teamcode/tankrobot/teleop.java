package org.firstinspires.ftc.teamcode.tankrobot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="teleop")
public class teleop extends OpMode {
    private PController pController = new PController(0.1);
    private Hardware robot = Hardware.instance;


    @Override
    public void init() {
        robot = robot.getInstance();
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
    robot.rightMotor.setPower(pController.Calculate(0, robot.rightMotor.getCurrentPosition()));
    robot.leftMotor.setPower(pController.Calculate(0, robot.leftMotor.getCurrentPosition()));
    robot.rightMotor.setPower(gamepad1.left_stick_y);
    robot.leftMotor.setPower(gamepad1.right_stick_y);
    }
}
