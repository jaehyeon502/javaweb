import React from "react";

import { Box, Avatar, Typography } from "@mui/material";

import { ILikeUser, Liky } from "src/interfaces";

interface Props {
    likeUser: Liky;
}

export default function LikeListItem({ likeUser } : Props) {
  return (
    <Box component="span" sx={{ display: "inline-flex", alignItems: "center", mr:'30px' }}>
      <Avatar component="span" sx={{ width: "32px", height: "32px", mr: "8px" }} src={likeUser.userProfileUrl ? likeUser.userProfileUrl : ''} />
      <Typography component="span" sx={{ fontSize: "16px", fontWeight: "500" }}>{likeUser.userNickname}</Typography>
    </Box>
  );
}
