package com.tutv.generator;

import java.io.File;
import java.util.EnumSet;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import com.tutv.entity.User;

/**
 * SchemeGenerator
 */
public class SchemeGenerator {

	public static final String SCRIPT_FILE = "exportScript.sql";
	public ServletContext context;

	private static SchemaExport getSchemaExport() {

		SchemaExport export = new SchemaExport();
		// Script file.
		File outputFile = new File(SCRIPT_FILE);
		String outputFilePath = outputFile.getAbsolutePath();

		System.out.println("Export file: " + outputFilePath);

		export.setDelimiter(";");
		export.setOutputFile(outputFilePath);

		// No Stop if Error
		export.setHaltOnError(false);
		//
		return export;
	}

	public static void dropDataBase(SchemaExport export, Metadata metadata) {
		// TargetType.DATABASE - Execute on Databse
		// TargetType.SCRIPT - Write Script file.
		// TargetType.STDOUT - Write log to Console.
		EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);

		export.drop(targetTypes, metadata);
	}

	public static void createDataBase(SchemaExport export, Metadata metadata) {
		// TargetType.DATABASE - Execute on Databse
		// TargetType.SCRIPT - Write Script file.
		// TargetType.STDOUT - Write log to Console.

		EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);

		SchemaExport.Action action = SchemaExport.Action.CREATE;
		//
		export.execute(targetTypes, action, metadata);

		System.out.println("Export OK");

	}

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("./config/hibernate-mysql.cfg.xml");
		// Create the ServiceRegistry from hibernate-xxx.cfg.xml
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties())
		    .build();

		MetadataSources metadatas = new MetadataSources(serviceRegistry);
		metadatas.addAnnotatedClass(User.class);
		Metadata metadata = metadatas.buildMetadata();

		SchemaExport export = getSchemaExport();

		System.out.println("Drop Database...");
		// Drop Database
		dropDataBase(export, metadata);

		System.out.println("Create Database...");
		// Create tables
		createDataBase(export, metadata);

		SessionFactory sessionFactory = conf.buildSessionFactory(serviceRegistry);
		sessionFactory.getCurrentSession();
	}
}