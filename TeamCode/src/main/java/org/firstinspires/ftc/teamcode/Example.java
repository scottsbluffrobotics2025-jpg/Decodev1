package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Example extends OpMode {

    DcMotor testMotor;
    Servo servo;
    DcMotor anything;
    double servoPos;

    public void init() {
        // this is how you log telemetry
        telemetry.addData("This is the caption input","this is the value");

        // This is how you initialize the motor and servo
        testMotor = hardwareMap.get(DcMotor.class, "testMotor");
        servo = hardwareMap.get(Servo.class, "testServo");
        anything = hardwareMap.get(DcMotor.class, "testmoter2");
    }



    public void loop() {
        servoPos = gamepad1.right_trigger-gamepad1.left_trigger;

        servo.setPosition(servoPos);
        testMotor.setPower(gamepad1.right_stick_x);
    }


}
