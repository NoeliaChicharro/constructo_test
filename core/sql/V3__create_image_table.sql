CREATE TABLE [dbo].[images] (
    [ID]    BIGINT        NOT NULL,
    [name]  VARCHAR (500) NOT NULL,
    [image] IMAGE         NOT NULL,
    CONSTRAINT [PK_images] PRIMARY KEY CLUSTERED ([ID] ASC)
    );