package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class aBlue1PickUpSkystone extends OpMode {

    @Override
    protected void execute() {

        robot.slide(0.5,1);
        robot.tilt(0.5,1.25);
        robot.openClaw();

        robot.drive(0.5,0,32);

        robot.closeClaw();
        robot.tilt(-0.5,1.3);
        robot.turn(180,0.5);

        robot.drive(0.5,0,24);


        robot.turn(90,0.5);
        robot.drive(0.5,0,64);
        robot.openClaw();

        robot.turn(180,0.5);
        robot.drive(0.5,0,32);
    }


}
