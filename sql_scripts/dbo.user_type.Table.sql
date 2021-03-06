USE [Library]
GO
/****** Object:  Table [dbo].[user_type]    Script Date: 12/21/2018 14:43:16 ******/
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
ALTER TABLE [dbo].[user_type]  WITH CHECK ADD  CONSTRAINT [FK_user_type_user_type1] FOREIGN KEY([user_type])
REFERENCES [dbo].[user_type] ([user_type])
GO
ALTER TABLE [dbo].[user_type] CHECK CONSTRAINT [FK_user_type_user_type1]
GO
