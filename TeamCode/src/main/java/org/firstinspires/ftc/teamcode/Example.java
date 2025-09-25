package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Example extends OpMode {

    public void init() {
        if (gamepad1.b) {
            telemetry.addData("B is pressed","yeah");
        }
    }

    public void loop() {

    }

}
