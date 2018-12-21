USE [master]
GO
/****** Object:  Database [Library]    Script Date: 12/21/2018 21:32:36 ******/
CREATE DATABASE [Library] ON  PRIMARY 
( NAME = N'library', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\library.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'library_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\library_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Library] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Library].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Library] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [Library] SET ANSI_NULLS OFF
GO
ALTER DATABASE [Library] SET ANSI_PADDING OFF
GO
ALTER DATABASE [Library] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [Library] SET ARITHABORT OFF
GO
ALTER DATABASE [Library] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [Library] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [Library] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [Library] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [Library] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [Library] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [Library] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [Library] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [Library] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [Library] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [Library] SET  DISABLE_BROKER
GO
ALTER DATABASE [Library] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [Library] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [Library] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [Library] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [Library] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [Library] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [Library] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [Library] SET  READ_WRITE
GO
ALTER DATABASE [Library] SET RECOVERY FULL
GO
ALTER DATABASE [Library] SET  MULTI_USER
GO
ALTER DATABASE [Library] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [Library] SET DB_CHAINING OFF
GO
EXEC sys.sp_db_vardecimal_storage_format N'Library', N'ON'
GO
USE [Library]
GO
/****** Object:  Table [dbo].[book_typeinfo]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_typeinfo](
	[book_ISBN] [varchar](100) NOT NULL,
	[book_topic] [varchar](100) NULL,
	[book_type] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[book_ISBN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_table]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_table](
	[loc_barcode] [varchar](20) NOT NULL,
	[book_ISBN] [varchar](100) NOT NULL,
	[loc_callNo] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[loc_barcode] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_storeinfo]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_storeinfo](
	[loc_barcode] [varchar](20) NOT NULL,
	[loc_callNo] [varchar](50) NOT NULL,
	[loc_voliss] [varchar](50) NULL,
	[loc_room] [varchar](20) NULL,
	[loc_status] [varchar](10) NULL,
	[loc_location] [varchar](20) NULL,
	[book_left] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[loc_barcode] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_isbn]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_isbn](
	[book_ISBN] [varchar](100) NOT NULL,
	[book_name] [varchar](100) NOT NULL,
	[book_meta_name] [varchar](50) NULL,
	[book_author] [varchar](100) NOT NULL,
	[book_secondary_author] [varchar](50) NULL,
	[book_publisher] [varchar](50) NOT NULL,
	[book_price] [float] NULL,
	[book_CDServiceContact] [varchar](200) NULL,
	[book_outline] [varchar](255) NULL,
	[book_menu] [varchar](200) NULL,
	[book_author_ps] [varchar](100) NULL,
	[book_abstract] [varchar](200) NULL,
	[book_target] [varchar](100) NULL,
	[book_douban_summarized] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[book_ISBN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[user_type]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user_type](
	[user_type] [varchar](10) NOT NULL,
	[max_borrow] [int] NOT NULL,
 CONSTRAINT [PK_user_type] PRIMARY KEY CLUSTERED 
(
	[user_type] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[user_table]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user_table](
	[user_id] [varchar](20) NOT NULL,
	[user_pwd] [varchar](20) NOT NULL,
	[user_name] [varchar](10) NOT NULL,
	[user_sex] [nchar](2) NOT NULL,
	[start_date] [date] NOT NULL,
	[end_date] [date] NOT NULL,
	[email] [varchar](20) NULL,
	[tel] [nchar](11) NULL,
	[address] [varchar](50) NULL,
	[user_type] [varchar](10) NULL,
 CONSTRAINT [PK_user_table] PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_borrow_table]    Script Date: 12/21/2018 21:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_borrow_table](
	[loc_barcode] [varchar](20) NOT NULL,
	[loc_borrTime] [date] NULL,
	[loc_dueTime] [date] NULL,
 CONSTRAINT [PK_book_borrow_table] PRIMARY KEY CLUSTERED 
(
	[loc_barcode] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF__book_type__book___21B6055D]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_typeinfo] ADD  DEFAULT (NULL) FOR [book_topic]
GO
/****** Object:  Default [DF__book_type__book___22AA2996]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_typeinfo] ADD  DEFAULT (NULL) FOR [book_type]
GO
/****** Object:  Default [DF__book_tabl__loc_c__1CF15040]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_table] ADD  DEFAULT (NULL) FOR [loc_callNo]
GO
/****** Object:  Default [DF__dbo.book___loc_v__07020F21]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo] ADD  DEFAULT (NULL) FOR [loc_voliss]
GO
/****** Object:  Default [DF__dbo.book___loc_r__07F6335A]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo] ADD  DEFAULT (NULL) FOR [loc_room]
GO
/****** Object:  Default [DF__dbo.book___loc_s__08EA5793]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo] ADD  DEFAULT (NULL) FOR [loc_status]
GO
/****** Object:  Default [DF__dbo.book___loc_l__09DE7BCC]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo] ADD  DEFAULT (NULL) FOR [loc_location]
GO
/****** Object:  Default [DF__dbo.book___book___0AD2A005]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo] ADD  DEFAULT (NULL) FOR [book_left]
GO
/****** Object:  Default [DF__book_isbn__book___0F975522]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_meta_name]
GO
/****** Object:  Default [DF__book_isbn__book___108B795B]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_secondary_author]
GO
/****** Object:  Default [DF__book_isbn__book___117F9D94]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_price]
GO
/****** Object:  Default [DF__book_isbn__book___1273C1CD]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_CDServiceContact]
GO
/****** Object:  Default [DF__book_isbn__book___1367E606]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_outline]
GO
/****** Object:  Default [DF__book_isbn__book___145C0A3F]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_menu]
GO
/****** Object:  Default [DF__book_isbn__book___15502E78]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_author_ps]
GO
/****** Object:  Default [DF__book_isbn__book___164452B1]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_abstract]
GO
/****** Object:  Default [DF__book_isbn__book___173876EA]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_target]
GO
/****** Object:  Default [DF__book_isbn__book___182C9B23]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_isbn] ADD  DEFAULT (NULL) FOR [book_douban_summarized]
GO
/****** Object:  ForeignKey [FK_book_storeinfo_book_storeinfo]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_storeinfo]  WITH CHECK ADD  CONSTRAINT [FK_book_storeinfo_book_storeinfo] FOREIGN KEY([loc_barcode])
REFERENCES [dbo].[book_storeinfo] ([loc_barcode])
GO
ALTER TABLE [dbo].[book_storeinfo] CHECK CONSTRAINT [FK_book_storeinfo_book_storeinfo]
GO
/****** Object:  ForeignKey [FK_user_type_user_type1]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[user_type]  WITH CHECK ADD  CONSTRAINT [FK_user_type_user_type1] FOREIGN KEY([user_type])
REFERENCES [dbo].[user_type] ([user_type])
GO
ALTER TABLE [dbo].[user_type] CHECK CONSTRAINT [FK_user_type_user_type1]
GO
/****** Object:  ForeignKey [FK_user_table_user_type]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[user_table]  WITH CHECK ADD  CONSTRAINT [FK_user_table_user_type] FOREIGN KEY([user_type])
REFERENCES [dbo].[user_type] ([user_type])
GO
ALTER TABLE [dbo].[user_table] CHECK CONSTRAINT [FK_user_table_user_type]
GO
/****** Object:  ForeignKey [FK_book_borrow_table_book_table]    Script Date: 12/21/2018 21:32:36 ******/
ALTER TABLE [dbo].[book_borrow_table]  WITH CHECK ADD  CONSTRAINT [FK_book_borrow_table_book_table] FOREIGN KEY([loc_barcode])
REFERENCES [dbo].[book_table] ([loc_barcode])
GO
ALTER TABLE [dbo].[book_borrow_table] CHECK CONSTRAINT [FK_book_borrow_table_book_table]
GO
