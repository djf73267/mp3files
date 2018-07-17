Please, use only legally obtained mp3 files!

Compilation and running of Java programs accessing/playing mp3 files

   In order to compile the sample programs in this directory, you need
   to place the three jar files in this directory on your CLASSPATH (or
   use them on the list given as the -cp argument).  The three jar files
   are:

      jl1.0.1.jar 
      mp3spi1.9.5.jar
      tritonus_share.jar

For example, this is the assignment of my CLASSPATH in my .bash_profile:

CLASSPATH=.:./classes::/home/profs/kochut/classes/jl1.0.1.jar:/home/profs/kochut/classes/mp3spi1.9.5.jar:/home/profs/kochut/classes/tritonus_share.jar:/home/profs/kochut/classes/junit-4.12.jar:/home/profs/kochut/classes/hamcrest-core-1.3.jar


Included files:

MP3Player.java

  The file MP3Player.java is a simple player of mp3 files.  Please, copy
  this file and use it to provide an mp3 file playback.  The player is
  a simple multi-threaded Java program (we haven't covered threads in
  class, but don't be alarmed) to allow the user to terminate a
  playback at any time (you will be prompted to press a return key).
  You will have to press the return key after the playback has finished,
  as well.  The player supports only mp3 files.

RunMP3Player.java

  This is a simple test class for MP3Player class.  Run it with a
  single mp3 file as argument.  It illustrates how to play several
  files (here, the same file over and over again).  In your project,
  you may have to play several user selections.

PrintMP3Properties.java

  This a simple program illustrating how to access some basic
  tags from an mp3 file.  Run it with a single mp3 file as argument.
  The files serves as an example, and you should perform similar
  steps while implementing the MP3File constructor.

  For example, run:

    java PrintMP3Properties sample_music/Venice.mp3

sample_music

  A directory with a few mp3 files for testing your program.
  These are demo mp3 files of some bands from Athens and other places.
  You can look for other samples of legal tracks at many places on 
  the Web, including www.indierockcafe.com and www.acidplanet.com.
