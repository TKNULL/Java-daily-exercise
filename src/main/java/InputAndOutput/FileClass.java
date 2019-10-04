package InputAndOutput;

import java.io.File;

public class FileClass {

    /**
    * File类常见用法
    * 访问目录和文件（文件/路径名、路径、绝对路径、绝对路径名、修改文件名/目录）
    * 文件检测（全部返回布尔值；existe,canWrite,canRead,isFile,isDirectory,isAbsolute）
    * 获取常规文件信息
    * 文件操作相关方法
    * 目录操作相关方法
    *
    *
    * */

    public void fileClassMath(){
        //以当前路径来创建一个File对象
        File file = new File(".");

        //一、访问文件名相关的方法（文件/路径名、路径、绝对路径、绝对路径名、修改文件名/目录）
        //0、获取文件名或路径名
        String name = file.getName();
        System.out.println("获取文件名或路径名"+name);

        //1、返回此File对象所对应的路径名
        String filepath = file.getPath();
        System.out.println("返回此File对象所对应的路径名"+filepath);

        //2、获取此File对象的绝对路径
        File absolutefilepath = file.getAbsoluteFile();
        System.out.println("获取此File对象的绝对路径"+absolutefilepath.getClass().toString());

        //3、获取此File对象所对应的绝对路径名
        String absolutefile = file.getAbsolutePath();
        System.out.println("获取此File对象所对应的绝对路径名"+absolutefile);

        //4、返回此File对象所对应目录的父目录名
        String parent = file.getParent();
        System.out.println("返回此File对象所对应目录的父目录名"+parent);

        //5、重命名此File对象所对应的文件或目录，如果重命名成功，返回true
        Boolean isTrue = file.renameTo(new File("rename"));
        System.out.println("重命名此File对象所对应的文件或目录，如果重命名成功，返回true"+isTrue);

        //二、文件检测相关方法（返回布尔值；existe,canWrite,canRead,isFile,isDirectory,isAbsolute）
        //0、判断File对象所对应的文件或目录是否存在
        Boolean isExists = file.exists();
        System.out.println(isExists);

        //1、判断File对象所对应的文件或目录是否可写
        Boolean canWrite = file.canWrite();
        System.out.println(canWrite);

        //2、判断File对象所对应的文件或目录是否可读
        Boolean canRead = file.canRead();
        System.out.println(canRead);

        //3、判断File对象所对应的目录是否是文件，而不是目录
        Boolean isFile = file.isFile();
        System.out.println(isFile);

        //4、判断File对象所对应的目录是否是目录，而不是文件
        Boolean isDirectory = file.isDirectory();
        System.out.println(isDirectory);

        //5、判断File对象所对应的文件是否是绝对路径
        Boolean isAbsolute = file.isAbsolute();
        System.out.println(isAbsolute);

        //三、获取常规文件信息（最后修改时间，内容长度）
        //1、返回文件的最后修改时间
        Long lastModified = file.lastModified();
        System.out.println(lastModified);

        //2、返回文件内容的长度
        Long length = file.length();
        System.out.println(length);

        //四、文件操作相关的方法
        //1、创建文件
        File file1 = new File.create











    }





}
