package com.ebookfrenzy.myfriends;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {
    private static final int version = 1;
    private static final String name = "testDB";
    private static final String tableName = "friends";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + tableName + " (" +
                "  id INTEGER PRIMARY KEY NOT NULL," +
                "  name varchar(255) default NULL," +
                "  phone varchar(100) default NULL," +
                "  email varchar(255) default NULL" +
                ");";

        db.execSQL(sql);

        sql = "INSERT INTO `friends` (`name`,`phone`,`email`) VALUES ('Shad Chambers','ullamcorper.Duis.cursus@Loremipsum.ca','(454) 532-2870'),('Tamara Acosta','amet@ametmassaQuisque.org','(419) 684-6181'),('Conan Carlson','Nunc.mauris@arcuAliquam.co.uk','(176) 826-6353'),('Hanna Guerrero','metus.In.nec@faucibus.co.uk','(611) 980-1367'),('Minerva Buck','luctus@tempus.co.uk','(756) 220-3245'),('Marcia Foreman','adipiscing.Mauris@massaIntegervitae.com','(543) 924-5495'),('Jeanette Vang','et.commodo.at@sitamet.co.uk','(326) 491-7540'),('Xantha Gill','Lorem@natoquepenatibuset.edu','(154) 961-0253'),('Emmanuel Henderson','ut.odio.vel@aliquet.com','(249) 873-2982'),('Cade Suarez','Sed.nulla@feugiat.net','(241) 114-7164'),('Tara Wilkerson','amet@dignissimMaecenas.org','(503) 627-5312'),('Stella Williams','eu@nequenon.net','(114) 218-8675'),('Zenia Zimmerman','consequat.enim@dignissim.edu','(541) 570-0827'),('Thane Gutierrez','Maecenas@ametrisusDonec.co.uk','(835) 748-1005'),('Dacey Rodriquez','nonummy.ac.feugiat@Crasconvallis.co.uk','(515) 138-0984'),('Ruby Bowers','Cras.vulputate.velit@atarcu.edu','(972) 899-1326'),('Wanda Langley','Nunc.mauris@sitamet.com','(116) 802-7982'),('Shaine Buckley','sit.amet@duilectusrutrum.org','(294) 876-0175'),('Colleen Rich','dolor.Nulla.semper@nulla.com','(450) 756-8410'),('Robin Cole','mattis.Cras@Nulla.org','(351) 756-6951'),('Magee Avila','aliquet@Fuscedolor.org','(463) 801-7543'),('Beatrice Hall','pede.Nunc@cubiliaCurae.net','(428) 980-8738'),('Myles Beasley','molestie.orci@justoProin.co.uk','(666) 709-7706'),('Micah Dickson','luctus.Curabitur@eleifendnunc.co.uk','(668) 530-1316'),('Lee Black','dolor.dolor.tempus@Fuscefeugiat.net','(600) 452-8484'),('Felix Harmon','ut@Nam.org','(659) 185-5747'),('Deirdre Burt','tortor.Integer@idenim.edu','(279) 649-1343'),('Mollie Harrison','erat@tellusSuspendissesed.com','(241) 383-0817'),('Conan Savage','ante.ipsum@Aliquamauctorvelit.org','(558) 671-3601'),('Noah Evans','Quisque.imperdiet.erat@Donec.org','(538) 793-2915'),('Roanna Day','euismod.ac@facilisisSuspendisse.ca','(407) 263-1072'),('Wing Lawson','netus.et.malesuada@Curabiturutodio.ca','(658) 354-7690'),('Paula Patel','lectus.rutrum.urna@vitae.edu','(340) 912-4763'),('Bruce Blevins','dolor.dapibus.gravida@varius.co.uk','(632) 515-2823'),('Karyn Logan','arcu.Aliquam.ultrices@est.net','(110) 931-9225'),('Leonard Nunez','mauris.blandit.mattis@ac.org','(393) 478-0340'),('Nichole Gross','Donec@nequeNullam.net','(449) 514-3111'),('Natalie Martinez','sit@Nullamsuscipit.com','(356) 240-1328'),('Nina Tate','risus.Quisque@Suspendissesagittis.ca','(851) 128-8724'),('Geoffrey Dalton','Integer@aliquamenim.edu','(200) 242-3143'),('Griffin Charles','Aliquam.auctor@duiSuspendisseac.net','(362) 363-9825'),('Sean Pruitt','aliquet.libero@quisdiamPellentesque.ca','(769) 281-4543'),('Patience Norton','erat.eget@quis.net','(869) 529-1044'),('Keelie Marquez','tincidunt.dui.augue@consectetueripsumnunc.net','(730) 123-2859'),('Talon Sloan','tempus.non@amet.edu','(942) 929-5844'),('Aurora Ford','metus@ipsum.ca','(257) 944-9429'),('Madonna Ayers','ligula.Nullam@consectetueradipiscingelit.com','(182) 904-5138'),('Urielle Gay','vel@nuncinterdumfeugiat.org','(358) 828-1567'),('Elizabeth Wilkerson','commodo.ipsum@etmagnisdis.edu','(780) 263-3897'),('Irma Norman','nulla.Integer.vulputate@Praesenteunulla.edu','(905) 538-0581'),('Wynter Ochoa','Donec@euodioPhasellus.ca','(274) 277-0649'),('Hannah Gilliam','Proin@Intincidunt.ca','(762) 170-3687'),('Jason Harvey','Quisque@placerataugueSed.ca','(599) 803-1895'),('Ainsley Snow','nisi@ipsumdolorsit.com','(196) 284-0296'),('Josephine Cross','a.enim.Suspendisse@Phasellus.net','(824) 941-9597'),('Lael Carver','Sed@dignissimlacus.org','(675) 474-7001'),('Clementine Curtis','laoreet.ipsum.Curabitur@ridiculus.edu','(779) 847-9296'),('Nathaniel Lawson','porttitor.vulputate.posuere@mauris.com','(518) 152-1366'),('Pearl Whitney','Suspendisse@Donecegestas.co.uk','(186) 325-4777'),('Cheryl Hogan','congue.elit.sed@cursusnon.org','(393) 124-2746'),('Todd Mendoza','Quisque.ornare@duiCraspellentesque.edu','(810) 432-3867'),('Samson Flowers','lobortis@nasceturridiculus.net','(231) 501-0127'),('Jerry Nash','euismod.et.commodo@estNunc.edu','(436) 778-6373'),('Kirsten Woods','Nulla.facilisis.Suspendisse@dapibusrutrumjusto.ca','(889) 763-7224'),('Kelsey Wheeler','in.dolor.Fusce@Quisque.net','(616) 298-8113'),('Rinah Salinas','a.nunc.In@fermentumvelmauris.ca','(864) 237-7788'),('Hiram Travis','vel.convallis.in@erosNamconsequat.com','(814) 362-8329'),('Ignacia Mcgowan','Nulla.interdum@tempuslorem.ca','(310) 261-7881'),('Alisa Dickerson','ipsum.dolor@aliquameuaccumsan.ca','(539) 571-7481'),('Janna Henderson','tristique.pellentesque@DonecnibhQuisque.co.uk','(693) 374-7828'),('Charlotte Keller','penatibus.et.magnis@semut.co.uk','(184) 867-1189'),('Ocean Williamson','Aliquam.erat@nisinibhlacinia.edu','(317) 770-7257'),('Veronica Kinney','ullamcorper.viverra.Maecenas@Quisque.net','(613) 282-8967'),('Kenyon Paul','neque.Nullam.ut@mi.net','(952) 614-1249'),('Fulton Bryant','vulputate.risus@eu.edu','(210) 980-5124'),('Kameko Armstrong','varius.et@urna.edu','(347) 785-5753'),('Branden Workman','tortor@quis.net','(442) 332-3047'),('Velma Young','et.euismod.et@vulputaterisusa.net','(739) 744-8682'),('Katell Conner','tempus.eu@Naminterdumenim.net','(731) 591-6608'),('Britanney Robertson','luctus@sedsapienNunc.com','(722) 580-4410'),('August Hill','et.malesuada.fames@senectus.co.uk','(142) 881-6210'),('Leandra Le','Nullam@ultricessitamet.net','(561) 901-9941'),('Blaine Bush','quis.lectus.Nullam@viverraMaecenas.com','(897) 313-7268'),('Frances Valencia','tristique.pellentesque.tellus@Maurisvel.com','(973) 367-9731'),('Tana Solomon','vulputate.velit@non.edu','(746) 524-6231'),('Ariana Pugh','enim@egestasurna.ca','(133) 834-7028'),('Naida Branch','Proin.ultrices@placerat.com','(736) 394-1090'),('Nolan Pollard','vitae.odio@aliquet.com','(901) 193-6289'),('Ali Brewer','cursus.in.hendrerit@telluslorem.net','(526) 369-3104'),('Thaddeus Wagner','vel.nisl.Quisque@Sednullaante.ca','(175) 176-8062'),('Dieter Snyder','dui.nec@veliteu.org','(277) 977-6149'),('Myles Harris','quis@maurisidsapien.net','(811) 848-4175'),('James Vinson','malesuada.augue@facilisiSedneque.co.uk','(818) 725-8404'),('Rebekah Pruitt','tristique@non.ca','(540) 898-1271'),('Channing Copeland','lectus.convallis@scelerisque.org','(950) 354-8037'),('Timothy Bowman','bibendum.ullamcorper.Duis@Duis.ca','(176) 845-4233'),('Hadley Padilla','velit.dui.semper@Suspendissealiquetmolestie.org','(385) 454-5185'),('Clark Ferguson','aliquet@velitCraslorem.net','(629) 195-1815'),('Oleg Henry','urna.justo.faucibus@utodiovel.com','(989) 740-2279'),('MacKenzie Bennett','Duis@euultrices.co.uk','(462) 489-5842');";

        db.execSQL(sql);
        System.out.println("Created table");

    }

    public List<Friends> getAllFriends(SQLiteDatabase db) {
        String sql = "SELECT * FROM 'friends'";
        Cursor cursor = db.rawQuery(sql, null);
        List<Friends> friends = new ArrayList<Friends>();
        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            Friends friend = new Friends();
            friend.setId(cursor.getString(0));
            friend.setName(cursor.getString(1));
            friend.setPhone(cursor.getString(2));
            friend.setEmail(cursor.getString(3));
            friend.toString();
            friends.add(friend);
        }
        return friends;
    }

    public Friends getFriend(SQLiteDatabase db, String name) {
        String sql = "Select * from friends WHERE name = '" + name + "';";
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        Friends friend = new Friends();
        friend.setId(cursor.getString(0));
        friend.setName(cursor.getString(1));
        friend.setPhone(cursor.getString(2));
        friend.setEmail(cursor.getString(3));
        return friend;
    }

    public List<String> getAllNames(SQLiteDatabase db) {
        String sql = "SELECT name FROM 'friends'";
        Cursor cursor = db.rawQuery(sql, null);
        List<String> names = new ArrayList<String>();
        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            names.add(cursor.getString(0));

        }
        System.out.println("Found # of names:" + names.size());
        return names;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        onCreate(db);
    }
}